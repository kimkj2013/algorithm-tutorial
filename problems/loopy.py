def loopy(x):
  
  for i in range(0, x):
    if (i <= x):
      loopy(x)
    print x

loopy(5)
