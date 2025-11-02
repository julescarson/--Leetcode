var join = function(arr1, arr2) {
    let ans = {}
    for (let i = 0; i<arr1.length; i++) {
        ans[arr1[i].id] = arr1[i]
    }
    for (let i = 0; i<arr2.length; i++) {
        if (ans[arr2[i].id]) {
            for (let key in arr2[i]) {
                ans[arr2[i].id][key] = arr2[i][key]
            } 
        } else {
            ans[arr2[i].id] = arr2[i]
        }
    }

    return Object.values(ans)
};
