/**
 * Create a Bank Account
 * Author: Andrew Jarombek
 * Date: 7/26/2023
 */

package _go

type BankAccount struct {
	accountNumber string
	accountHolder string
	balance       float64
}

func NewBankAccount(accountNumber string, accountHolder string, balance float64) *BankAccount {
	return &BankAccount{accountNumber: accountNumber, accountHolder: accountHolder, balance: balance}
}

func (ba *BankAccount) Withdraw(amount float64) bool {
	if amount > ba.balance {
		return false
	}

	ba.balance -= amount
	return true
}

func (ba *BankAccount) Deposit(amount float64) bool {
	ba.balance += amount
	return true
}

func (ba *BankAccount) GetAccountNumber() string {
	return ba.accountNumber
}

func (ba *BankAccount) GetAccountHolder() string {
	return ba.accountHolder
}

func (ba *BankAccount) GetBalance() float64 {
	return ba.balance
}
