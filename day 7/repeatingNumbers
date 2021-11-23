count=0
for ((i=10 ; i<100 ; i++ ))
do
    if [ $((i%10)) -eq   $(((i/10)%10)) ]
    then
        repeatingNumbers[((count++))]=$i
    fi

done

echo "${repeatingNumbers[@]} "
