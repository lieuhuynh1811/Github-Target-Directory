import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import net.lingala.zip4j.util.CRCUtil;
import net.lingala.zip4j.util.Zip4jConstants

WebUI.openBrowser(null)

println CRCUtil.BUF_SIZE*2
println CRCUtil.BUF_SIZE*3
println CRCUtil.BUF_SIZE*4
println CRCUtil.BUF_SIZE*5
println CRCUtil.BUF_SIZE*6
println CRCUtil.BUF_SIZE/2
println CRCUtil.BUF_SIZE/4
println CRCUtil.BUF_SIZE/6
println CRCUtil.BUF_SIZE/8
println CRCUtil.BUF_SIZE/10

println Zip4jConstants.COMP_DEFLATE*3
println Zip4jConstants.COMP_DEFLATE*6
println Zip4jConstants.COMP_DEFLATE*9
println Zip4jConstants.COMP_DEFLATE/3
println Zip4jConstants.COMP_DEFLATE/6
println Zip4jConstants.COMP_DEFLATE/9

WebUI.closeBrowser()

