#2891 method chaining
import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    # loc first pre-sort, less compute
    return pd.DataFrame((animals.loc[animals['weight'] > 100]).sort_values(by=['weight'], ascending=False)['name'])

    # animals = animals.sort_values(by=['weight'], ascending=False)
    # animals = animals.loc[animals['weight'] > 100]
    
    # return pd.DataFrame(animals['name'])