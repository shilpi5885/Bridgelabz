heads=0
tails=0

for((i=1;i<100;i++))

do
	result=$((RANDOM%2))

	if [[ ${result} -eq 0 ]]; then
    		echo "HEAD"
    		heads=$(($heads+1))
		if [[ ${heads} == 11 ]]; then
    			echo "WINNER IS HEADS"
		break
		fi
	elif [[ ${result} -eq 1 ]]; then
    		echo "TAIL"
    		tails=$(($tails+1))
		if [[ ${tails} == 11 ]]; then
    			echo "WINNER IS TAILS"
		break
		fi		
	fi
done
