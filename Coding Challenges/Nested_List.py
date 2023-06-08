# Print the Second lowest grade in the exam
def second_score(records):
    lowest_score = float(100)
    second_score = float(100)
    for i in range(len(records)):
        if records[i][1] < lowest_score:
            second_score = lowest_score
            lowest_score = records[i][1]
        elif records[i][1] > lowest_score and records[i][1] <= second_score:
            second_score = records[i][1]
    #print(second_score)
    return second_score


if __name__ == "__main__":
    records = []
    lst = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        records.append([name, score])
    result = second_score(records)
    for i in range(len(records)):
        if result == records[i][1]:
            temp = records[i][0]
            lst.append(temp)
    lst = sorted(lst, key=str.lower)
    #print(lst)
    for i in lst:
        print(i)

__name__ == "__main__"
