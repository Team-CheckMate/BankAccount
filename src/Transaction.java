
public class Transaction {

    private final String transactionDate; //거래일
    private final String transactionTime; //거래시간
    private final String kind; //구분(입금 또는 출금)
    private final long amount; //거래금액
    private final long balance; //잔고
    private DateTime datetime; //날짜 받기

    public Transaction(String kind, long amount, long balance, String transactionDate,
            String transactionTime) {
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
    }

    /*
     날짜 반환 메소드
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /*
     시간 반환 메소드
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /*
    구분 반환 메소드
     */
    public String getKind() {
        return kind;
    }

    /*
     거래금액 반환 메소드
     */
    public long getAmount() {
        return amount;
    }

    /*
     잔고 반환 메소드
     */
    public long getBalance() {
        return balance;
    }

    /*
     거래내역 출력 메서드
     */
    public void printTransactionList() {
        System.out.println(
                "[ 거래금액 :" + getAmount() + "원, 잔액 : " + getBalance() + "원 /" + getTransactionDate()
                        + " " + getTransactionTime() + "]");

    }


}
