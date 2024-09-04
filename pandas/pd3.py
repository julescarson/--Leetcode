#2882
import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    #built in drop duplicates based on a subset column
    return customers.drop_duplicates(subset=["email"])