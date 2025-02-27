package bridge.Bridge;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import java.util.List;

import bridge.InputView;
import bridge.OutputView;


public class Bridge {

    public int brdigeSize;

    public static List<String> bridgePattern;
    private BridgeRandomNumberGenerator bridgeNumberGenerator;
    private BridgeMaker bridgeMaker;

    public Bridge(){
        OutputView.printReadBridgeSize();
        brdigeSize = InputView.readBridgeSize();

        bridgeNumberGenerator = new BridgeRandomNumberGenerator();
        bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
        bridgePattern = bridgeMaker.makeBridge(brdigeSize);
    }

}
