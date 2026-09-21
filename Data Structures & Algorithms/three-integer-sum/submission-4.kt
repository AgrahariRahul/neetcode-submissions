class Solution {
    fun threeSum(numsarray: IntArray): List<List<Int>> {
        var resultSet = mutableSetOf<List<Int>>()
        var nums = numsarray.sorted()
        for(i in nums.indices){ 
           
            var j=i+1
            

            while(j<= nums.lastIndex){
                var k = j+1
                while(k<=nums.lastIndex){
                var sum = nums[i]+nums[j]+nums[k]
                if(sum==0){
                    resultSet.add(listOf(nums[i],nums[j],nums[k]))
                }
                k++
                }
                j++
            }

        }
        println("result : ${resultSet.joinToString(",")}")
        return resultSet.map{it.toList()}
    }
}
