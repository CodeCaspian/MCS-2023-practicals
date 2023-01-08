# Implement Linear Regression for Predicting House Prices 

import matplotlib.pyplot as mtp  
import pandas as pd  
import numpy as np

data_set= pd.read_csv(r"C:\Users\A\Downloads\DataHouse - DataHouse.csv") 

#  Area is independent Variable
x= data_set.iloc[:, :-1].values

# Price is Dependent Variable 
y= data_set.iloc[:, 1].values  

# Splitting the dataset into training and test set.  
from sklearn.model_selection import train_test_split  
x_train, x_test, y_train, y_test= train_test_split(x, y, test_size= 0.2, random_state=None)  

#Fitting the Simple Linear Regression model to the training dataset  
from sklearn.linear_model import LinearRegression  
regressor= LinearRegression()  
regressor.fit(x_train, y_train)  

#Prediction of Test and Training set result  
y_pred = regressor.predict(x_test) #accuracy of testing 
x_pred = regressor.predict(x_train)  #accuracy of training

#always perform accuracy on independent (x)

#scatter plot
mtp.scatter(x_train, y_train, color="green")   
mtp.plot(x_train, x_pred, color="red")    # ---> always perform accuracy on independent (x)
mtp.title("Area vs Prices (Training Dataset)")  
# mtp.xlabel("Area of Houses")  
# mtp.ylabel("Prices(In Rupees)")  
mtp.show() 

mtp.scatter(x_test, y_test, color="blue")   
mtp.plot(x_train, x_pred, color="red")    # ---> always perform accuracy on independent (x)
mtp.title("Area  vs Price (Test Dataset)")  
# mtp.xlabel("Area of Houses ")  
# mtp.ylabel("Prices(In Rupees)")  
mtp.show()    


# Predict Price of Particular House 
new_price_pred = regressor.predict([[1500]])

print('The predicted Price of house whose area  is 1500 ',new_price_pred)


# #Find out Resudial(Error) in actual and predicted

# from sklearn.metrics import mean_squared_error

# error = mean_squared_error(y_test,y_pred)

# print('The error between predicted and actual  is ',error)
