import re
import collections
from collections import Counter

word = re.findall(r'\w+', open('washington.txt').read().lower())

dict_ = Counter(word)

keys = dict_.keys()

items = [(v, k) for k, v in dict_.items()]
items.sort()
items.reverse()

for k, v in items:
  print str(v) + ' - ' + str(k)
