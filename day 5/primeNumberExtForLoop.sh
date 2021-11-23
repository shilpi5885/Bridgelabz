#Extend the program to take a range of number as input and output the Prime  Numbers in that range. 

echo "enter start range"
read m
echo "enter end range"
read n

for a in $(seq $m $n)
do
    k=0
    for i in $(seq 2 $(expr $a - 1))
    do 
        if [ $(expr $a % $i) -eq 0 ]
        then
            k=1
            break
        fi
    done
    if [ $k -eq 0 ]
    then
    echo $a
    fi
done
