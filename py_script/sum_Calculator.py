import sys
s_num = sys.argv[1]
e_num = sys.argv[2]
sum = 0

for i in range(int(s_num), int(e_num)+1):
    sum+=i

print("sum ", s_num, " to " ,e_num, " = ", sum)