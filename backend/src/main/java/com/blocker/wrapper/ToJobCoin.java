package com.blocker.wrapper;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class ToJobCoin extends Contract {
    public static final String BINARY = "0x60606040526040805190810160405280600481526020017f48312e30000000000000000000000000000000000000000000000000000000008152506006908051906020019062000051929190620001c1565b5034156200005e57600080fd5b683635c9adc5dea000006000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002081905550683635c9adc5dea000006002819055506040805190810160405280600581526020017f546f4a6f620000000000000000000000000000000000000000000000000000008152506003908051906020019062000107929190620001c1565b506012600460006101000a81548160ff021916908360ff1602179055506040805190810160405280600281526020017f544a0000000000000000000000000000000000000000000000000000000000008152506005908051906020019062000171929190620001c1565b50600160078190555033600960006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555062000270565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200020457805160ff191683800117855562000235565b8280016001018555821562000235579182015b828111156200023457825182559160200191906001019062000217565b5b50905062000244919062000248565b5090565b6200026d91905b80821115620002695760008160009055506001016200024f565b5090565b90565b61134780620002806000396000f3006060604052600436106100d0576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806306fdde0314610389578063095ea7b31461041757806318160ddd146104715780632194f3a21461049a57806323b872dd146104ef578063313ce5671461056857806354fd4d501461059757806365f2bc2e1461062557806370a082311461064e578063933ba4131461069b57806395d89b41146106c4578063a9059cbb14610752578063cae9ca51146107ac578063dd62ed3e14610849575b600034600854016008819055506007543402905080600080600960009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020541015151561015357600080fd5b80600080600960009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205403600080600960009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002081905550806000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054016000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055503373ffffffffffffffffffffffffffffffffffffffff16600960009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef836040518082815260200191505060405180910390a3600960009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f19350505050151561038657600080fd5b50005b341561039457600080fd5b61039c6108b5565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156103dc5780820151818401526020810190506103c1565b50505050905090810190601f1680156104095780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561042257600080fd5b610457600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091908035906020019091905050610953565b604051808215151515815260200191505060405180910390f35b341561047c57600080fd5b610484610a45565b6040518082815260200191505060405180910390f35b34156104a557600080fd5b6104ad610a4b565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156104fa57600080fd5b61054e600480803573ffffffffffffffffffffffffffffffffffffffff1690602001909190803573ffffffffffffffffffffffffffffffffffffffff16906020019091908035906020019091905050610a71565b604051808215151515815260200191505060405180910390f35b341561057357600080fd5b61057b610cea565b604051808260ff1660ff16815260200191505060405180910390f35b34156105a257600080fd5b6105aa610cfd565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156105ea5780820151818401526020810190506105cf565b50505050905090810190601f1680156106175780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561063057600080fd5b610638610d9b565b6040518082815260200191505060405180910390f35b341561065957600080fd5b610685600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050610da1565b6040518082815260200191505060405180910390f35b34156106a657600080fd5b6106ae610de9565b6040518082815260200191505060405180910390f35b34156106cf57600080fd5b6106d7610def565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156107175780820151818401526020810190506106fc565b50505050905090810190601f1680156107445780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561075d57600080fd5b610792600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091908035906020019091905050610e8d565b604051808215151515815260200191505060405180910390f35b34156107b757600080fd5b61082f600480803573ffffffffffffffffffffffffffffffffffffffff1690602001909190803590602001909190803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091905050610ff3565b604051808215151515815260200191505060405180910390f35b341561085457600080fd5b61089f600480803573ffffffffffffffffffffffffffffffffffffffff1690602001909190803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050611294565b6040518082815260200191505060405180910390f35b60038054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561094b5780601f106109205761010080835404028352916020019161094b565b820191906000526020600020905b81548152906001019060200180831161092e57829003601f168201915b505050505081565b600081600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925846040518082815260200191505060405180910390a36001905092915050565b60025481565b600960009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000816000808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205410158015610b3d575081600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205410155b8015610b495750600082115b15610cde57816000808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008282540192505081905550816000808673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000828254039250508190555081600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825403925050819055508273ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef846040518082815260200191505060405180910390a360019050610ce3565b600090505b9392505050565b600460009054906101000a900460ff1681565b60068054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610d935780601f10610d6857610100808354040283529160200191610d93565b820191906000526020600020905b815481529060010190602001808311610d7657829003601f168201915b505050505081565b60075481565b60008060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050919050565b60085481565b60058054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610e855780601f10610e5a57610100808354040283529160200191610e85565b820191906000526020600020905b815481529060010190602001808311610e6857829003601f168201915b505050505081565b6000816000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205410158015610edd5750600082115b15610fe857816000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008282540392505081905550816000808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825401925050819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef846040518082815260200191505060405180910390a360019050610fed565b600090505b92915050565b600082600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508373ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925856040518082815260200191505060405180910390a38373ffffffffffffffffffffffffffffffffffffffff1660405180807f72656365697665417070726f76616c28616464726573732c75696e743235362c81526020017f616464726573732c627974657329000000000000000000000000000000000000815250602e01905060405180910390207c01000000000000000000000000000000000000000000000000000000009004338530866040518563ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018481526020018373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001828051906020019080838360005b83811015611234578082015181840152602081019050611219565b50505050905090810190601f1680156112615780820380516001836020036101000a031916815260200191505b5094505050505060006040518083038160008761646e5a03f192505050151561128957600080fd5b600190509392505050565b6000600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050929150505600a165627a7a723058207144147b29b6a4c601dcc84ab3bb29e60cbf31555b92be0f6e36c5832cbee5b50029";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_APPROVE = "approve";

    public static final String FUNC_TOTALSUPPLY = "totalSupply";

    public static final String FUNC_FUNDSWALLET = "fundsWallet";

    public static final String FUNC_TRANSFERFROM = "transferFrom";

    public static final String FUNC_DECIMALS = "decimals";

    public static final String FUNC_VERSION = "version";

    public static final String FUNC_UNITSONEETHCANBUY = "unitsOneEthCanBuy";

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_TOTALETHINWEI = "totalEthInWei";

    public static final String FUNC_SYMBOL = "symbol";

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_ALLOWANCE = "allowance";

    public static final String FUNC_APPROVEANDCALL = "approveAndCall";

    public static final Event TRANSFER_EVENT = new Event("Transfer", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event APPROVAL_EVENT = new Event("Approval", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected ToJobCoin(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ToJobCoin(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ToJobCoin(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ToJobCoin(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> approve(String _spender, BigInteger _value) {
        final Function function = new Function(
                FUNC_APPROVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> totalSupply() {
        final Function function = new Function(FUNC_TOTALSUPPLY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> fundsWallet() {
        final Function function = new Function(FUNC_FUNDSWALLET, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> transferFrom(String _from, String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFERFROM, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> decimals() {
        final Function function = new Function(FUNC_DECIMALS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> version() {
        final Function function = new Function(FUNC_VERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> unitsOneEthCanBuy() {
        final Function function = new Function(FUNC_UNITSONEETHCANBUY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> balanceOf(String _owner) {
        final Function function = new Function(FUNC_BALANCEOF, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> totalEthInWei() {
        final Function function = new Function(FUNC_TOTALETHINWEI, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> symbol() {
        final Function function = new Function(FUNC_SYMBOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> transfer(String _to, BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> allowance(String _owner, String _spender) {
        final Function function = new Function(FUNC_ALLOWANCE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner), 
                new org.web3j.abi.datatypes.Address(_spender)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse._to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<TransferEventResponse> transferEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse._to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<TransferEventResponse> transferEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFER_EVENT));
        return transferEventFlowable(filter);
    }

    public List<ApprovalEventResponse> getApprovalEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(APPROVAL_EVENT, transactionReceipt);
        ArrayList<ApprovalEventResponse> responses = new ArrayList<ApprovalEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ApprovalEventResponse typedResponse = new ApprovalEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse._spender = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ApprovalEventResponse> approvalEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, ApprovalEventResponse>() {
            @Override
            public ApprovalEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(APPROVAL_EVENT, log);
                ApprovalEventResponse typedResponse = new ApprovalEventResponse();
                typedResponse.log = log;
                typedResponse._owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse._spender = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse._value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ApprovalEventResponse> approvalEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(APPROVAL_EVENT));
        return approvalEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> approveAndCall(String _spender, BigInteger _value, byte[] _extraData) {
        final Function function = new Function(
                FUNC_APPROVEANDCALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_spender), 
                new org.web3j.abi.datatypes.generated.Uint256(_value), 
                new org.web3j.abi.datatypes.DynamicBytes(_extraData)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static ToJobCoin load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ToJobCoin(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ToJobCoin load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ToJobCoin(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ToJobCoin load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ToJobCoin(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ToJobCoin load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ToJobCoin(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ToJobCoin> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ToJobCoin.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<ToJobCoin> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ToJobCoin.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ToJobCoin> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ToJobCoin.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ToJobCoin> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ToJobCoin.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static class TransferEventResponse extends BaseEventResponse {
        public String _from;

        public String _to;

        public BigInteger _value;
    }

    public static class ApprovalEventResponse extends BaseEventResponse {
        public String _owner;

        public String _spender;

        public BigInteger _value;
    }
}