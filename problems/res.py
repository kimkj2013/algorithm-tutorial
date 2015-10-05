import re
import collections # call collections class
from collections import Counter # call Counter function

word = re.findall(r'\w+', open('washington.txt').read().lower()) # parse all the words

dict_ = Counter(word) # make a dictionary

# here I could've used item to help solve a problem
items = [(count, voca) for voca, count in dict_.items()]
items.sort() # sorting ascending order, with respect to word counts
items.reverse() # changing to descending order

# print all the items in voca - count format
for count, voca in items:
  print voca + ' - ' + str(count)
