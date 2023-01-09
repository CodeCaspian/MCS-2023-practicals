# Area Bedroom Age Price

import numpy as nm  
import matplotlib.pyplot as plt  
import pandas as pd  
  
data_set= pd.read_csv(r"C:\Users\A\Downloads\mrdata - mrdata (1).csv")  

data_set = data_set.fillna(data_set.median()) 
  
x= data_set.iloc[:, :-1].values  
y= data_set.iloc[:, 3].values
 
from sklearn.model_selection import train_test_split  
x_train, x_test, y_train, y_test= train_test_split(x, y, test_size= 0.2, random_state=0)  
 
from sklearn.linear_model import LinearRegression  
regressor= LinearRegression()  
regressor.fit(x_train, y_train)  
  
y_pred = regressor.predict(x_test) 

new_price_pred = regressor.predict([[3000, 4, 15]])
print('The predicted Price of house whose area  is  ',new_price_pred)
