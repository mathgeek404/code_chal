for _ in range(0,input()):
    arr = map(int,raw_input().split(' '))
    N = arr[0]
    M = arr[1]
    adj = [[0 for j in range(0,N)] for i in range(0,N)]
    for _n in range(0,M):
        arr = map(int, raw_input().split(' '))
        adj[arr[0]-1][arr[1]-1] = 1
        adj[arr[1]-1][arr[0]-1] = 1
    S = input()-1
    queue = []
    visited = [-1 for i in range(0,N)]
    visited[S] = 0
    queue.append(S)
    while(len(queue)>0):
        val = queue.pop(0)
        # If visited, ignore
        for j in range(0,N):
            #print(adj[val])
            if (adj[val][j]==1):
                if (visited[j] == -1):
                    visited[j] = visited[val]+6
                    queue.append(j)
    del(visited[S])
    print(" ".join(map(str,visited)))
