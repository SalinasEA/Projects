'''
Write the in_order() function, which has a list of integers as a parameter, and returns True if the integers are sorted (in order from low to high) or False otherwise. The program outputs "In order" if the list is sorted, or "Not in order" if the list is not sorted.

Ex: If the list passed to the in_order() function is [5, 6, 7, 8, 3], then the function returns False and the program outputs:

Not in order
Ex: If the list passed to the in_order() function is [5, 6, 7, 8, 10], then the function returns True and the program outputs:

In order
Note: Use a for loop. DO NOT use sorted() or sort().
'''

# This program defines a function called in_order(nums) that checks if a list of numbers is in ascending order.
# It returns True if the list is in order, otherwise False.
def in_order(nums):
    previous_i = nums[0]
    check = False
    for i in nums:
        
        if i < previous_i:
            check = False
            break
        
        else:
            check = True
        
        previous_i = i
        
    return check
    
if __name__ == '__main__':
    # Test out-of-order example
    nums1 = [5, 6, 7, 8, 3]
    if in_order(nums1):
        print('In order')
    else:
        print('Not in order')
        
    # Test in-order example
    nums2 = [5, 6, 7, 8, 10]
    if in_order(nums2):
        print('In order')
    else:
        print('Not in order')