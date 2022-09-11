package _算法.leetcode;

public class Bank {
    long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > balance.length || account2 > balance.length || balance[account1 - 1] < money) {
            return false;
        } else {
            balance[account1 - 1] -= money;
            balance[account2 - 1] += money;
            return true;
        }
    }

    public boolean deposit(int account, long money) {
        if (account > balance.length) {
            return false;
        } else {
            balance[account - 1] += money;
            return true;
        }
    }

    public boolean withdraw(int account, long money) {
        if (account > balance.length || balance[account - 1] - money < 0) {
            return false;
        } else {
            balance[account - 1] -= money;
            return true;
        }
    }
}
