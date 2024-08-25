# class solution:
#     count=0
#     nums=[1,2,3,4,5]
#     for i in range(0,len(nums)):
#         for j in range(i+1,len(nums)):
#             if(nums[j]==nums[i]):
#                 count=count+1
#             else:
#                 j=j+1
#     if(count==0):
#         print("0")
#     else:
#         print("1")
            
s="Hello world"
a=s.split()

for i in range(len(a)):
    for word in a:
        if(word==a[i]):
            print(len(a[i]))