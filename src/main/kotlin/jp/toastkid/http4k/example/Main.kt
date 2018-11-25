package jp.toastkid.http4k.example

import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.routing.bind
import org.http4k.routing.routes
import org.http4k.server.SunHttp
import org.http4k.server.asServer

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        routes("/hello" bind Method.GET to { _: Request -> Response(OK).body("Hello!") })
                .asServer(SunHttp(8000))
                .start()
    }
}
