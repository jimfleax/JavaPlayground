# Day 7 Solutions

## Add
```java
static int add(int a, int b) {
    return a + b;
}
```

## Even
```java
static boolean isEven(int n) {
    return n % 2 == 0;
}
```

## Max of Three
```java
static int maxOfThree(int a, int b, int c) {
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    return max;
}
```

## Count Digits
```java
static int countDigits(int n) {
    n = Math.abs(n);
    if (n == 0) return 1;
    int count = 0;
    while (n > 0) {
        count++;
        n /= 10;
    }
    return count;
}
```

## Reverse
```java
static int reverseNumber(int n) {
    int sign = n < 0 ? -1 : 1;
    n = Math.abs(n);
    int rev = 0;
    while (n > 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }
    return sign * rev;
}
```

## Prime
```java
static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

## GCD
```java
static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
        int t = a % b;
        a = b;
        b = t;
    }
    return a;
}
```
