package view;

import static view.Const.showAccountsByName;
import static view.Const.showAccountsByNo;
import static view.Const.showAllAccounts;
import static view.Const.showTransactionList;

import java.util.List;
import model.Account;
import model.Transaction;

public class OutputView {

  public void displayTransactions(List<Transaction> transactions) {
    showTransactionList();
    for(Transaction transaction : transactions) {
      System.out.println(transaction);
    }
  }

  /**
   * 특정 계좌에서 출금하고 잔액을 출력하는 메서드
   * @param account: 출금할 계좌 객체
   */
  public void displayAccountWithDraw(Account account) {
    System.out.printf("현재 잔액은 %d원 입니다.%n",account.getBalance());
    System.out.println();
  }

  /**
   * 소유자명으로 계좌 목록을 출력하는 메서드
   * @param accounts: 출력할 계좌 목록
   */
  public void displayAccountsByName(List<Account> accounts) {
    showAccountsByName();
    for(Account account : accounts) {
      System.out.println(account);
    }
    System.out.println();
  }

  /**
   * 특정 계좌에 입금하고 잔액을 출력하는 메서드
   * @param account: 입금을 할 계좌 객체
   */
  public void displayAccountDeposit(Account account) {
    System.out.printf("현재 잔액은 %d원 입니다.%n",account.getBalance());
    System.out.println();
  }

  /**
   * 계좌 정보를 출력하는 메서드
   * @param account: 출력할 계좌 객체
   */
  public void displayAccountByNo(Account account) {
    showAccountsByNo();
    System.out.println(account);
    System.out.println();
  }

  /**
   * 전체 계좌 목록을 출력하는 메서드
   * @param accounts: 계좌 목록
   */
  public void displayAllAccounts(List<Account> accounts) {
    showAllAccounts();
    for (Account account: accounts) {
      System.out.println(account);
    }
    System.out.println();
  }
}
