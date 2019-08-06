
package cn.org;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getStationAndTimeDataSetByLikeTrainCodeResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStationAndTimeDataSetByLikeTrainCodeResult"
})
@XmlRootElement(name = "getStationAndTimeDataSetByLikeTrainCodeResponse")
public class GetStationAndTimeDataSetByLikeTrainCodeResponse {

    protected GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult getStationAndTimeDataSetByLikeTrainCodeResult;

    /**
     * 获取getStationAndTimeDataSetByLikeTrainCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult }
     *     
     */
    public GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult getGetStationAndTimeDataSetByLikeTrainCodeResult() {
        return getStationAndTimeDataSetByLikeTrainCodeResult;
    }

    /**
     * 设置getStationAndTimeDataSetByLikeTrainCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult }
     *     
     */
    public void setGetStationAndTimeDataSetByLikeTrainCodeResult(GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult value) {
        this.getStationAndTimeDataSetByLikeTrainCodeResult = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class GetStationAndTimeDataSetByLikeTrainCodeResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
