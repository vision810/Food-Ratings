//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package foodratings.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proizvajalec" type="{http://KISFoodLib}Proizvajalec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "proizvajalec"
})
@XmlRootElement(name = "readProizvajalecResponse")
public class ReadProizvajalecResponse {

    @XmlElement(required = true, nillable = true)
    protected Proizvajalec proizvajalec;

    /**
     * Gets the value of the proizvajalec property.
     * 
     * @return
     *     possible object is
     *     {@link Proizvajalec }
     *     
     */
    public Proizvajalec getProizvajalec() {
        return proizvajalec;
    }

    /**
     * Sets the value of the proizvajalec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proizvajalec }
     *     
     */
    public void setProizvajalec(Proizvajalec value) {
        this.proizvajalec = value;
    }

}
