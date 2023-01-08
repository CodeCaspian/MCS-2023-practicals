import pandas as pd
from sklearn.preprocessing import LabelEncoder 
lb = LabelEncoder()
import seaborn as sns
iris = sns.load_dataset("iris")
# iris['species'][5] = "Tooty"
df = iris['species'].head(6) #-> Pick Categorical Column
print(lb.fit_transform(df))
df
