/**
 * @param {number[]} nums
 * @return {number}
 */
var maxFrequencyElements = function(nums) {
    let map = new Map();
    for(let i=0; i<nums.length; i++){
        map.set(nums[i], (map.get(nums[i]) || 0)+1)
    }
    let max = -Infinity
    for(let val of map.values()){
        max = Math.max(max, val);
    }
    let count = 0;
    for(let key of map.keys()){
        if(map.get(key) == max){
            count = count+max;
        }
    }
    return count;
};