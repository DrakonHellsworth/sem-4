import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score
# Load the dataset
df= pd.read_csv('housing_prices.csv')
# Display the first few rows of the dataset
print(df.head())

reg=LinearRegression()
reg.fit(df[['Area_sqft','Bedrooms','Bathrooms','Balcony','Parking','Age_Years','Furnished_Yes','Location_Suburban','Location_Urban']],df.Price)
#find r2 and mse
y_pred = reg.predict(df[['Area_sqft','Bedrooms','Bathrooms','Balcony','Parking','Age_Years','Furnished_Yes','Location_Suburban','Location_Urban']])
mse = mean_squared_error(df.Price, y_pred)
r2 = r2_score(df.Price, y_pred)
print(f'Mean Squared Error: {mse}')
print(f'R^2 Score: {r2}')
plot = sns.scatterplot(x=df.Price, y=y_pred)
plt.xlabel('Actual Prices')