/**
 * Copyright 2020 WaterdogTEAM
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pe.waterdog.command;

import pe.waterdog.ProxyServer;
import pe.waterdog.utils.types.TextContainer;

/**
 * Base interface for all instances that are able to issue commands.
 */
public interface CommandSender {

    String getName();

    boolean isPlayer();

    boolean hasPermission(String permission);

    void sendMessage(String message);

    void sendMessage(TextContainer message);

    ProxyServer getProxy();
}
