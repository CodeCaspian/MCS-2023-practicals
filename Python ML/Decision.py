import numpy as np  
import matplotlib.pyplot as plt  
import pandas as pd  

data_set= pd.read_csv('Position_Salaries.csv')  
  
x= data_set.iloc[:, 1:2].values  
y= data_set.iloc[:, 2].values 

from sklearn.model_selection import train_test_split  
x_train, x_test, y_train, y_test= train_test_split(x, y, test_size= 0.2, random_state=0)  

from sklearn.tree import DecisionTreeRegressor
regressor = DecisionTreeRegressor(random_state=0)
regressor.fit(x_train, y_train)

pred = regressor.predict(x_test)

from sklearn import metrics
r_square = metrics.r2_score(y_test,pred)
print('Accuracy of Model is ',r_square)

new_price_pred = regressor.predict([[6.5]])
print('The Salary of Level 6.5 is  is  ',new_price_pred)
