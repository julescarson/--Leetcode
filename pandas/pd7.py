#2883
import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    #dropna fn with subset on the column
    return students.dropna(subset="name")