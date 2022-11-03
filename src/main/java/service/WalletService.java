package service;


import dto.Wallet;
import exception.AlreadyExistingAccountNumberException;
import exception.InsufficeintAmountException;
import exception.WalletException;

public interface WalletService {

	Wallet registerWallet(Wallet newWallet) throws WalletException, InsufficeintAmountException, AlreadyExistingAccountNumberException;
	
	Boolean login(Integer walletId,String password) throws WalletException, InsufficeintAmountException;

	Double addFundsToWallet(Integer walletId, Double amount) throws WalletException, InsufficeintAmountException;

	Double showWalletBalance(Integer walletId) throws WalletException, InsufficeintAmountException;

	Boolean fundTransfer(Integer fromId, Integer toId, Double amount) throws WalletException, InsufficeintAmountException;
	
	Wallet unRegisterWallet(Integer walletId,String password) throws WalletException, InsufficeintAmountException;

	Double withdraw(Integer walletId, Double amount) throws WalletException, InsufficeintAmountException;
}
