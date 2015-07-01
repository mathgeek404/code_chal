class Stack:
  def __init__(self):
    self.list = []
    self.pos = -1
    
  def push(self,obj):
    self.list.append(obj)
    self.pos += 1
    
  def pop(self):
    if (self.pos == -1):
      raise NameError("You dun goofed: EOS")
    else:
      val = self.list.pop()
      self.pos -= 1
      return val
 
  def hasNext(self):
    if (self.pos == -1):
      return False
    else:
      return True

def main():
  test_cases = input()
  for _ in range(0,test_cases):
    num_nodes = input()+1
    graph_table = {n:[] for n in range(1,num_nodes+1)}
	  
    for i in range(1,num_nodes+1):
      edge_data = raw_input().split(' ')
		  
      for v in range(1,int(edge_data[0])+1):
	graph_table[i].append(int(edge_data[v]))
      
    prob_table = {}   
    for ind, val in enumerate(raw_input().split(' ')):
      prob_table[ind+1] = float(val)
    
    #print graph_table
    #print prob_table
     
    #Holds whether a node can reach node N+1 
    can_reach = {n:False for n in range(1,num_nodes)}
    
    #Check for each node
    for i in range(1,num_nodes):
      stack = Stack()  
      visited = {n:False for n in range(1,num_nodes)}
      
      stack.push(i)
      
      #dfs 
      while (stack.hasNext()):
	node = stack.pop()
	
	if (node==num_nodes or can_reach[node]):
	  can_reach[i] = True
	  break  
	  
	elif (not visited[node]):
	  for j in graph_table[node]:
	    stack.push(j)
	  visited[node] = True
	  
    #Calculate probability
    print can_reach
    
    probability = 0
    for node in range(1,num_nodes):
      if (can_reach[node]):
	probability += prob_table[node]
    print int(probability)

if __name__=='__main__':
    main()
