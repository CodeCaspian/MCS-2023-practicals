import numpy as np  
import matplotlib.pyplot as plt  
import pandas as pd  

data_set= pd.read_csv(r"C:\Users\A\Downloads\Position_Salaries - Position_Salaries.csv")  

x = data_set.iloc[:, [1]].values
y = data_set.iloc[:, -1].values 

from sklearn.model_selection import train_test_split  
x_train, x_test, y_train, y_test= train_test_split(x, y, test_size= 0.2, random_state=None)

from sklearn.svm import SVC  
classifier = SVC(kernel='linear', random_state=0)  
classifier.fit(x_train, y_train)  

y_pred = classifier.predict(x_test) 
x_pred = classifier.predict(x_train)

print(classifier.predict([[16]]))

plt.scatter(x_train, y_train, color = 'red') 
plt.plot(x_train, regressor.predict(x_train), color = 'blue') 
plt.xlabel('Position level') 
plt.ylabel('Salary') 
plt.show()
