/*
 * Copyright 2016 Red Hat Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vertx.mqtt;

import io.vertx.codegen.annotations.CacheReturn;
import io.vertx.codegen.annotations.VertxGen;

/**
 * Will information from the remote MQTT client
 */
@VertxGen
public interface MqttWill {

  /**
   * @return the will flag for indicating the will message presence
   */
  @CacheReturn
  boolean isWillFlag();

  /**
   * @return the topic for the will as provided by the remote MQTT client
   */
  @CacheReturn
  String willTopic();

  /**
   * @return the payload for the will as provided by the remote MQTT client
   */
  @CacheReturn
  String willMessage();

  /**
   * @return the QoS level for the will as provided by the remote MQTT client
   */
  @CacheReturn
  int willQos();

  /**
   * @return true if the will must be retained as provided by the remote MQTT client
   */
  @CacheReturn
  boolean isWillRetain();
}
