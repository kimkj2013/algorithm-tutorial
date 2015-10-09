# Kaprekar's constant is 6174. 
# First introduced by a mathematician D. R. Kaprekar
# There is a speical algorithm to gain this number (Wikipedia)
#
# 1. Take any four-digit number, using at least two different digits.
# (0's are also allowed)
# Here, if you use the number 'aaaa' ex. 1111 you will get 0000 in
# a single iteration.
# 2. Arrange the digits in descending and then in ascending order to
# get 2 four-digit numbers, adding leading zeros if necessary
# 3. Subtract the smaller number from the bigger nuber.
# 4. Go back to step 2.

import sys

def get_k_const(num):
  if (num > 10000):
    raise Exception('Must be 4-digit number')
  if (num < 1 and num > -1):
    raise Exception('Not a kaprekar const')
  if (num > 6173 and num < 6175):
    return 0
  return 1 + get_k_const(int_to_descd(num) - int_to_ascnd(num));

def int_split(num):
  numlist = []
  for i in str(num):
    numlist.append(int(i))
  return numlist

def int_merge(numlist):
  num = 0
  for i in numlist:
    num = num * 10
    num = num + i
  return num

def int_to_ascnd(num):
  numlist = int_split(num)
  numlist.sort()
  return int_merge(numlist)

def int_to_descd(num):
  numlist = int_split(int_to_ascnd(num))
  numlist.reverse()
  return int_merge(numlist)

numlist = [3524, 2111, 9831, 4371, 1111, 4787, 6174, 5085, 9411]

print get_k_const(3524);

for i in numlist:
  print "The number %d will iterate %d times to get to 6174." % numlist[i], get_k_const(numlist[i])
