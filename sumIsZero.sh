echo -n "Enter the total number of elements in array :"
read n
echo "Enter numbers :"
i=0
while [ $i -lt $n ]
do
    read array[$i]
    i=$(($i + 1))
done

echo "ELements of the array: "${array[@]}
len=${#array[@]}

for (( i=0 ; i<$len-2 ; i++ ))
do 
	for (( j=i+1; j<$len-1 ; j++ ))
	do
		for (( k=j+1 ; k<$len ; k++ ))
		do
			if [ $(( array[$i]+array[$j]+array[$k] )) == 0 ]
			then
				echo "Sum of ${array[i]} ${array[j]} and ${array[k]} is zero"
			else
				echo "No 3 elements found whose sum is zero"
			fi
		done
	done	
done
