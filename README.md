# Okapi Tracking API

Okapi Tracking API is a simple and resilient wrapper library for the state-owned French logistical carrier's new parcel/mail tracking API (Okapi).

> Visit https://developer.laposte.fr/products/suivi/latest for more information about the official API.

## Use case

Pour obtenir le suivi d'un courrier, Colissimo ou Chronopost :

```java
import com.astrepid.okapi.IOkapiService;
import com.astrepid.okapi.OkapiServiceImpl;
import com.astrepid.okapi.tracking.OkapiTracking;

class Main {
    IOkapiService service = new OkapiServiceImpl("YOUR_API_KEY");

    OkapiTracking instance = service.getTracking("TRACKING_NUMBER");
}
```

To execute the tests, you'll need a valid sandbox API key. You can get one by registering on https://developer.laposte.fr.