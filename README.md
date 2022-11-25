# Okapi Tracking API

Okapi Tracking API is a simple and resilient wrapper library for the state-owned French logistical carrier's new parcel/mail tracking API (Okapi).

> Click [here](https://developer.laposte.fr/products/suivi/latest) to learn more about the official API.

## Requirements

- Java 8+
- Maven 3.8.1+
- A valid API key (see [Okapi > Applications](https://developer.laposte.fr/applications))

## Use case

To track a parcel or a mail, you need to call the `getTracking` method with the parcel's tracking number as a parameter:

```java
import com.astrepid.okapi.IOkapiService;
import com.astrepid.okapi.OkapiServiceImpl;
import com.astrepid.okapi.tracking.OkapiTracking;

class Main {
    IOkapiService service = new OkapiServiceImpl("YOUR_API_KEY");

    OkapiTracking tracking = service.getTracking("TRACKING_NUMBER");
}
```

To execute the tests, you need a valid sandbox API key. You can get one by registering [here](https://developer.laposte.fr).

## Authors

* **Astrepid** - *Multi-tracking, resilience, translation, etc* - [astrepid.com](https://astrepid.com)
* **DaJlab** - *Initial work* - [dajlab.org](https://dajlab.org)