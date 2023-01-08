import numpy as nm  
import matplotlib.pyplot as mtp  
import pandas as pd  
 
data_set= pd.read_csv('Startups.csv')  

#Extracting Independent and dependent Variable  
x= data_set.iloc[:, :-1].values  
y= data_set.iloc[:, 4].values

from sklearn.preprocessing import LabelEncoder, OneHotEncoder  
from sklearn.compose import ColumnTransformer
labelencoder_x = LabelEncoder()  
x[:, 3] = labelencoder_x.fit_transform(x[:,3])  
ct = ColumnTransformer([("Countries", OneHotEncoder(), [3])], remainder = 'passthrough')
x = ct.fit_transform(x)
 
x = x[:, 1:]  
print('New',x)
# If we do not remove the first dummy variable, then it may introduce multicollinearity in the model.

# Splitting the dataset into training and test set.  
from sklearn.model_selection import train_test_split  
x_train, x_test, y_train, y_test= train_test_split(x, y, test_size= 0.2, random_state=0)  

#Fitting the MLR model to the training set:  
from sklearn.linear_model import LinearRegression  
regressor = LinearRegression()  
regressor.fit(x_train, y_train)  

#Predicting the Test set result;  
y_pred= regressor.predict(x_test) 
print('y_pred',y_pred)

print('Train Score: ', regressor.score(x_train, y_train))  
print('Test Score: ', regressor.score(x_test, y_test)) 
