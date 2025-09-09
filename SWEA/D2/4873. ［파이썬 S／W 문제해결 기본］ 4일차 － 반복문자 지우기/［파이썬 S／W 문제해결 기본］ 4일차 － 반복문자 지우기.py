T = int(input())

for tc in range(1, T + 1):
    s = input().strip()
    stack = []

    for c in s:
        if stack and stack[-1] == c:  # 스택이 비어있지 않고 top이 현재 문자와 같으면
            stack.pop()
        else:
            stack.append(c)

    print(f"#{tc} {len(stack)}")
