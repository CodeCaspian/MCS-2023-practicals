import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
 
# Importing the dataset
datas = pd.read_csv('D:\iris.csv')

X = datas.iloc[:, 1:2].values
y = datas.iloc[:, 2].values

from sklearn.linear_model import LinearRegression
lin = LinearRegression()
lin.fit(X, y)

from sklearn.preprocessing import PolynomialFeatures
poly = PolynomialFeatures(degree = 4)
X_poly = poly.fit_transform(X)

plt.scatter(X, y, color = 'blue')
plt.plot(X, lin.predict(X), color = 'red')
plt.show()
 
poly.fit(X_poly, y)
lin2 = LinearRegression()
lin2.fit(X_poly, y)

plt.scatter(X, y, color = 'blue') 
plt.plot(X, lin2.predict(poly.fit_transform(X)), color = 'red')
plt.show()

pred = 110.0
predarray = np.array([[pred]])
print(lin.predict(predarray))
