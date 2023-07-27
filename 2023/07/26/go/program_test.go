/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 7/26/2023
 */

package _go

import (
	"testing"
)

func TestNewBankAccount(t *testing.T) {
	accountNumber := "123456789"
	accountHolder := "John Doe"
	balance := 1000.0

	account := NewBankAccount(accountNumber, accountHolder, balance)

	if account.GetAccountNumber() != accountNumber {
		t.Errorf("Expected account number %s, but got %s", accountNumber, account.GetAccountNumber())
	}

	if account.GetAccountHolder() != accountHolder {
		t.Errorf("Expected account holder %s, but got %s", accountHolder, account.GetAccountHolder())
	}

	if account.GetBalance() != balance {
		t.Errorf("Expected balance %f, but got %f", balance, account.GetBalance())
	}
}

func TestDeposit(t *testing.T) {
	account := NewBankAccount("123456789", "John Doe", 1000.0)
	account.Deposit(500.0)

	expectedBalance := 1500.0
	if account.GetBalance() != expectedBalance {
		t.Errorf("Expected balance %f after deposit, but got %f", expectedBalance, account.GetBalance())
	}
}

func TestWithdraw(t *testing.T) {
	account := NewBankAccount("123456789", "John Doe", 1000.0)

	// Test successful withdrawal
	success := account.Withdraw(500.0)
	if !success {
		t.Error("Expected withdrawal to be successful, but it failed")
	}

	expectedBalance := 500.0
	if account.GetBalance() != expectedBalance {
		t.Errorf("Expected balance %f after withdrawal, but got %f", expectedBalance, account.GetBalance())
	}

	// Test withdrawal with insufficient balance
	success = account.Withdraw(1000.0)
	if success {
		t.Error("Expected withdrawal to fail due to insufficient balance, but it succeeded")
	}

	if account.GetBalance() != expectedBalance {
		t.Errorf("Expected balance to remain %f after failed withdrawal, but got %f", expectedBalance, account.GetBalance())
	}
}

func TestWithdrawMoreThanBalance(t *testing.T) {
	account := NewBankAccount("123456789", "John Doe", 1000.0)

	success := account.Withdraw(1500.0)
	if success {
		t.Error("Expected withdrawal to fail due to insufficient balance, but it succeeded")
	}

	expectedBalance := 1000.0
	if account.GetBalance() != expectedBalance {
		t.Errorf("Expected balance to remain %f after failed withdrawal, but got %f", expectedBalance, account.GetBalance())
	}
}
