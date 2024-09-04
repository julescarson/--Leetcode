# 2878
import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    #using shape property on the dataframe
    return [players.shape[0], players.shape[1]]