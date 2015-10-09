# Kaprekar Number Investigation
# A Kaprekar number is the representation of whose square
# in that base can be split into two parts that add up
# to the original number again. (Wikipedia)
#
# Def1: X^2 = A*(b^n) + B where 0 < B < b^n; X = A + B
# Def2: X^2 = AN + B, where 0 < B < N; X = A + B => K(N)
#
# Sequence: 1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4879, 4950, ...
# (Ref: https://oeis.org/A006886)
#
# Properties:
# * For each X in K(N), N - X is in K(N)
# * In binary, all even 'perfect numbers' are Kaprekar numbers.
#  * Perfect numbers are integers, each of which is the sum of
#    all its divisors except itself. For example 6 = 1 + 2 + 3, 
#    where 1, 2, and 3 are divisors of 6.
# 
# Name after a mathematician D. R. Kaprekar
# 
# Algorithm implemented by Kwangju Kim

# Find the n'th sequence of Kaprekan numbers
def find_X(n):
  pass
