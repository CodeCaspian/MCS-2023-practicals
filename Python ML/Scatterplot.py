import seaborn as sns
import matplotlib.pyplot as plot
iris = sns.load_dataset("iris")
print(iris)
plot.scatter(iris.sepal_length, iris.sepal_width)
plot.title("Scatter Plot")
