package model;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Account {

    private final String accountNo;
    private final String name;
    private long balance;
    private final List<Transaction> transactions = new ArrayList<>();

 

    //입금 메서드
    public void deposit(long amount) {
        DateTime datetime = new DateTime();
        String day = datetime.getDate();
        String time = datetime.getTime();
        System.out.println(amount + "원 입금하셨습니다.");
        balance += amount;
        Transaction tt = new Transaction.TransactionBuilder().amount(amount).balance(balance).kind("입금").transactionDate(day).transactionTime(time).build();
        transactions.add(tt);
    }

    //출금 메서드
    public void withdraw(long amount) {
        DateTime datetime = new DateTime();
        String day = datetime.getDate();
        String time = datetime.getTime();
        if (amount > balance) {    //잔고 0일 때
            System.out.println("출금액이 현재 잔액보다 큽니다.");
            System.out.println("현재 잔액" + balance);
        } else {
            System.out.println(amount + "원 인출하셨습니다.");
            balance -= amount;
            Transaction tt = new Transaction.TransactionBuilder().amount(amount).balance(balance).kind("출금").transactionDate(day).transactionTime(time).build();
            transactions.add(tt);
        }
    }

    //거래내역 메서드
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[계좌번호 : ")
                .append(accountNo)
                .append(", 소유자 명 : ")
                .append(name)
                .append(", 잔액 : ")
                .append(balance)
                .append("]");
        return sb.toString();
    }
}
