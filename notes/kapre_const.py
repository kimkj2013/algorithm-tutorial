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
  if (num / 10000 != 0):
    raise Exception('Must be 4-digit number')
  pass

def int_to_ascnd(num):
  pass

def int_to_descd(num):
  pass

numlist = [3524, 2111, 9831, 4371, 1111, 4787, 6174, 5085, 9411]

h = get_k_const(400);
