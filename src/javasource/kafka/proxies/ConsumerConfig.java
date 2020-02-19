// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package kafka.proxies;

/**
 * The configuration of a consumer. See http://kafka.apache.org/documentation.html#newconsumerconfigs for all configuration options.
 */
public class ConsumerConfig
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject consumerConfigMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Kafka.ConsumerConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		key_deserializer("key_deserializer"),
		value_deserializer("value_deserializer"),
		fetch_min_bytes("fetch_min_bytes"),
		group_id("group_id"),
		heartbeat_interval_ms("heartbeat_interval_ms"),
		max_partition_fetch_bytes("max_partition_fetch_bytes"),
		session_timeout_ms("session_timeout_ms"),
		auto_offset_reset("auto_offset_reset"),
		exclude_internal_topics("exclude_internal_topics"),
		fetch_max_bytes("fetch_max_bytes"),
		isolation_level("isolation_level"),
		max_poll_interval_ms("max_poll_interval_ms"),
		max_poll_records("max_poll_records"),
		partition_assignment_strategy("partition_assignment_strategy"),
		auto_commit_interval_ms("auto_commit_interval_ms"),
		check_crcs("check_crcs"),
		fetch_max_wait_ms("fetch_max_wait_ms"),
		Consumer_ConsumerConfig("Kafka.Consumer_ConsumerConfig");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ConsumerConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Kafka.ConsumerConfig"));
	}

	protected ConsumerConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject consumerConfigMendixObject)
	{
		if (consumerConfigMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Kafka.ConsumerConfig", consumerConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Kafka.ConsumerConfig");

		this.consumerConfigMendixObject = consumerConfigMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ConsumerConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static kafka.proxies.ConsumerConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return kafka.proxies.ConsumerConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static kafka.proxies.ConsumerConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new kafka.proxies.ConsumerConfig(context, mendixObject);
	}

	public static kafka.proxies.ConsumerConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return kafka.proxies.ConsumerConfig.initialize(context, mendixObject);
	}

	public static java.util.List<kafka.proxies.ConsumerConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<kafka.proxies.ConsumerConfig> result = new java.util.ArrayList<kafka.proxies.ConsumerConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Kafka.ConsumerConfig" + xpathConstraint))
			result.add(kafka.proxies.ConsumerConfig.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of key_deserializer
	 */
	public final java.lang.String getkey_deserializer()
	{
		return getkey_deserializer(getContext());
	}

	/**
	 * @param context
	 * @return value of key_deserializer
	 */
	public final java.lang.String getkey_deserializer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.key_deserializer.toString());
	}

	/**
	 * Set value of key_deserializer
	 * @param key_deserializer
	 */
	public final void setkey_deserializer(java.lang.String key_deserializer)
	{
		setkey_deserializer(getContext(), key_deserializer);
	}

	/**
	 * Set value of key_deserializer
	 * @param context
	 * @param key_deserializer
	 */
	public final void setkey_deserializer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key_deserializer)
	{
		getMendixObject().setValue(context, MemberNames.key_deserializer.toString(), key_deserializer);
	}

	/**
	 * @return value of value_deserializer
	 */
	public final java.lang.String getvalue_deserializer()
	{
		return getvalue_deserializer(getContext());
	}

	/**
	 * @param context
	 * @return value of value_deserializer
	 */
	public final java.lang.String getvalue_deserializer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.value_deserializer.toString());
	}

	/**
	 * Set value of value_deserializer
	 * @param value_deserializer
	 */
	public final void setvalue_deserializer(java.lang.String value_deserializer)
	{
		setvalue_deserializer(getContext(), value_deserializer);
	}

	/**
	 * Set value of value_deserializer
	 * @param context
	 * @param value_deserializer
	 */
	public final void setvalue_deserializer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value_deserializer)
	{
		getMendixObject().setValue(context, MemberNames.value_deserializer.toString(), value_deserializer);
	}

	/**
	 * @return value of fetch_min_bytes
	 */
	public final java.lang.Integer getfetch_min_bytes()
	{
		return getfetch_min_bytes(getContext());
	}

	/**
	 * @param context
	 * @return value of fetch_min_bytes
	 */
	public final java.lang.Integer getfetch_min_bytes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.fetch_min_bytes.toString());
	}

	/**
	 * Set value of fetch_min_bytes
	 * @param fetch_min_bytes
	 */
	public final void setfetch_min_bytes(java.lang.Integer fetch_min_bytes)
	{
		setfetch_min_bytes(getContext(), fetch_min_bytes);
	}

	/**
	 * Set value of fetch_min_bytes
	 * @param context
	 * @param fetch_min_bytes
	 */
	public final void setfetch_min_bytes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer fetch_min_bytes)
	{
		getMendixObject().setValue(context, MemberNames.fetch_min_bytes.toString(), fetch_min_bytes);
	}

	/**
	 * @return value of group_id
	 */
	public final java.lang.String getgroup_id()
	{
		return getgroup_id(getContext());
	}

	/**
	 * @param context
	 * @return value of group_id
	 */
	public final java.lang.String getgroup_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.group_id.toString());
	}

	/**
	 * Set value of group_id
	 * @param group_id
	 */
	public final void setgroup_id(java.lang.String group_id)
	{
		setgroup_id(getContext(), group_id);
	}

	/**
	 * Set value of group_id
	 * @param context
	 * @param group_id
	 */
	public final void setgroup_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String group_id)
	{
		getMendixObject().setValue(context, MemberNames.group_id.toString(), group_id);
	}

	/**
	 * @return value of heartbeat_interval_ms
	 */
	public final java.lang.Integer getheartbeat_interval_ms()
	{
		return getheartbeat_interval_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of heartbeat_interval_ms
	 */
	public final java.lang.Integer getheartbeat_interval_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.heartbeat_interval_ms.toString());
	}

	/**
	 * Set value of heartbeat_interval_ms
	 * @param heartbeat_interval_ms
	 */
	public final void setheartbeat_interval_ms(java.lang.Integer heartbeat_interval_ms)
	{
		setheartbeat_interval_ms(getContext(), heartbeat_interval_ms);
	}

	/**
	 * Set value of heartbeat_interval_ms
	 * @param context
	 * @param heartbeat_interval_ms
	 */
	public final void setheartbeat_interval_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer heartbeat_interval_ms)
	{
		getMendixObject().setValue(context, MemberNames.heartbeat_interval_ms.toString(), heartbeat_interval_ms);
	}

	/**
	 * @return value of max_partition_fetch_bytes
	 */
	public final java.lang.Integer getmax_partition_fetch_bytes()
	{
		return getmax_partition_fetch_bytes(getContext());
	}

	/**
	 * @param context
	 * @return value of max_partition_fetch_bytes
	 */
	public final java.lang.Integer getmax_partition_fetch_bytes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.max_partition_fetch_bytes.toString());
	}

	/**
	 * Set value of max_partition_fetch_bytes
	 * @param max_partition_fetch_bytes
	 */
	public final void setmax_partition_fetch_bytes(java.lang.Integer max_partition_fetch_bytes)
	{
		setmax_partition_fetch_bytes(getContext(), max_partition_fetch_bytes);
	}

	/**
	 * Set value of max_partition_fetch_bytes
	 * @param context
	 * @param max_partition_fetch_bytes
	 */
	public final void setmax_partition_fetch_bytes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer max_partition_fetch_bytes)
	{
		getMendixObject().setValue(context, MemberNames.max_partition_fetch_bytes.toString(), max_partition_fetch_bytes);
	}

	/**
	 * @return value of session_timeout_ms
	 */
	public final java.lang.Integer getsession_timeout_ms()
	{
		return getsession_timeout_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of session_timeout_ms
	 */
	public final java.lang.Integer getsession_timeout_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.session_timeout_ms.toString());
	}

	/**
	 * Set value of session_timeout_ms
	 * @param session_timeout_ms
	 */
	public final void setsession_timeout_ms(java.lang.Integer session_timeout_ms)
	{
		setsession_timeout_ms(getContext(), session_timeout_ms);
	}

	/**
	 * Set value of session_timeout_ms
	 * @param context
	 * @param session_timeout_ms
	 */
	public final void setsession_timeout_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer session_timeout_ms)
	{
		getMendixObject().setValue(context, MemberNames.session_timeout_ms.toString(), session_timeout_ms);
	}

	/**
	 * @return value of auto_offset_reset
	 */
	public final java.lang.String getauto_offset_reset()
	{
		return getauto_offset_reset(getContext());
	}

	/**
	 * @param context
	 * @return value of auto_offset_reset
	 */
	public final java.lang.String getauto_offset_reset(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.auto_offset_reset.toString());
	}

	/**
	 * Set value of auto_offset_reset
	 * @param auto_offset_reset
	 */
	public final void setauto_offset_reset(java.lang.String auto_offset_reset)
	{
		setauto_offset_reset(getContext(), auto_offset_reset);
	}

	/**
	 * Set value of auto_offset_reset
	 * @param context
	 * @param auto_offset_reset
	 */
	public final void setauto_offset_reset(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String auto_offset_reset)
	{
		getMendixObject().setValue(context, MemberNames.auto_offset_reset.toString(), auto_offset_reset);
	}

	/**
	 * @return value of exclude_internal_topics
	 */
	public final java.lang.Boolean getexclude_internal_topics()
	{
		return getexclude_internal_topics(getContext());
	}

	/**
	 * @param context
	 * @return value of exclude_internal_topics
	 */
	public final java.lang.Boolean getexclude_internal_topics(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.exclude_internal_topics.toString());
	}

	/**
	 * Set value of exclude_internal_topics
	 * @param exclude_internal_topics
	 */
	public final void setexclude_internal_topics(java.lang.Boolean exclude_internal_topics)
	{
		setexclude_internal_topics(getContext(), exclude_internal_topics);
	}

	/**
	 * Set value of exclude_internal_topics
	 * @param context
	 * @param exclude_internal_topics
	 */
	public final void setexclude_internal_topics(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean exclude_internal_topics)
	{
		getMendixObject().setValue(context, MemberNames.exclude_internal_topics.toString(), exclude_internal_topics);
	}

	/**
	 * @return value of fetch_max_bytes
	 */
	public final java.lang.Integer getfetch_max_bytes()
	{
		return getfetch_max_bytes(getContext());
	}

	/**
	 * @param context
	 * @return value of fetch_max_bytes
	 */
	public final java.lang.Integer getfetch_max_bytes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.fetch_max_bytes.toString());
	}

	/**
	 * Set value of fetch_max_bytes
	 * @param fetch_max_bytes
	 */
	public final void setfetch_max_bytes(java.lang.Integer fetch_max_bytes)
	{
		setfetch_max_bytes(getContext(), fetch_max_bytes);
	}

	/**
	 * Set value of fetch_max_bytes
	 * @param context
	 * @param fetch_max_bytes
	 */
	public final void setfetch_max_bytes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer fetch_max_bytes)
	{
		getMendixObject().setValue(context, MemberNames.fetch_max_bytes.toString(), fetch_max_bytes);
	}

	/**
	 * @return value of isolation_level
	 */
	public final java.lang.String getisolation_level()
	{
		return getisolation_level(getContext());
	}

	/**
	 * @param context
	 * @return value of isolation_level
	 */
	public final java.lang.String getisolation_level(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.isolation_level.toString());
	}

	/**
	 * Set value of isolation_level
	 * @param isolation_level
	 */
	public final void setisolation_level(java.lang.String isolation_level)
	{
		setisolation_level(getContext(), isolation_level);
	}

	/**
	 * Set value of isolation_level
	 * @param context
	 * @param isolation_level
	 */
	public final void setisolation_level(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String isolation_level)
	{
		getMendixObject().setValue(context, MemberNames.isolation_level.toString(), isolation_level);
	}

	/**
	 * @return value of max_poll_interval_ms
	 */
	public final java.lang.Integer getmax_poll_interval_ms()
	{
		return getmax_poll_interval_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of max_poll_interval_ms
	 */
	public final java.lang.Integer getmax_poll_interval_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.max_poll_interval_ms.toString());
	}

	/**
	 * Set value of max_poll_interval_ms
	 * @param max_poll_interval_ms
	 */
	public final void setmax_poll_interval_ms(java.lang.Integer max_poll_interval_ms)
	{
		setmax_poll_interval_ms(getContext(), max_poll_interval_ms);
	}

	/**
	 * Set value of max_poll_interval_ms
	 * @param context
	 * @param max_poll_interval_ms
	 */
	public final void setmax_poll_interval_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer max_poll_interval_ms)
	{
		getMendixObject().setValue(context, MemberNames.max_poll_interval_ms.toString(), max_poll_interval_ms);
	}

	/**
	 * @return value of max_poll_records
	 */
	public final java.lang.Integer getmax_poll_records()
	{
		return getmax_poll_records(getContext());
	}

	/**
	 * @param context
	 * @return value of max_poll_records
	 */
	public final java.lang.Integer getmax_poll_records(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.max_poll_records.toString());
	}

	/**
	 * Set value of max_poll_records
	 * @param max_poll_records
	 */
	public final void setmax_poll_records(java.lang.Integer max_poll_records)
	{
		setmax_poll_records(getContext(), max_poll_records);
	}

	/**
	 * Set value of max_poll_records
	 * @param context
	 * @param max_poll_records
	 */
	public final void setmax_poll_records(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer max_poll_records)
	{
		getMendixObject().setValue(context, MemberNames.max_poll_records.toString(), max_poll_records);
	}

	/**
	 * @return value of partition_assignment_strategy
	 */
	public final java.lang.String getpartition_assignment_strategy()
	{
		return getpartition_assignment_strategy(getContext());
	}

	/**
	 * @param context
	 * @return value of partition_assignment_strategy
	 */
	public final java.lang.String getpartition_assignment_strategy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.partition_assignment_strategy.toString());
	}

	/**
	 * Set value of partition_assignment_strategy
	 * @param partition_assignment_strategy
	 */
	public final void setpartition_assignment_strategy(java.lang.String partition_assignment_strategy)
	{
		setpartition_assignment_strategy(getContext(), partition_assignment_strategy);
	}

	/**
	 * Set value of partition_assignment_strategy
	 * @param context
	 * @param partition_assignment_strategy
	 */
	public final void setpartition_assignment_strategy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String partition_assignment_strategy)
	{
		getMendixObject().setValue(context, MemberNames.partition_assignment_strategy.toString(), partition_assignment_strategy);
	}

	/**
	 * @return value of auto_commit_interval_ms
	 */
	public final java.lang.Integer getauto_commit_interval_ms()
	{
		return getauto_commit_interval_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of auto_commit_interval_ms
	 */
	public final java.lang.Integer getauto_commit_interval_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.auto_commit_interval_ms.toString());
	}

	/**
	 * Set value of auto_commit_interval_ms
	 * @param auto_commit_interval_ms
	 */
	public final void setauto_commit_interval_ms(java.lang.Integer auto_commit_interval_ms)
	{
		setauto_commit_interval_ms(getContext(), auto_commit_interval_ms);
	}

	/**
	 * Set value of auto_commit_interval_ms
	 * @param context
	 * @param auto_commit_interval_ms
	 */
	public final void setauto_commit_interval_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer auto_commit_interval_ms)
	{
		getMendixObject().setValue(context, MemberNames.auto_commit_interval_ms.toString(), auto_commit_interval_ms);
	}

	/**
	 * @return value of check_crcs
	 */
	public final java.lang.Boolean getcheck_crcs()
	{
		return getcheck_crcs(getContext());
	}

	/**
	 * @param context
	 * @return value of check_crcs
	 */
	public final java.lang.Boolean getcheck_crcs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.check_crcs.toString());
	}

	/**
	 * Set value of check_crcs
	 * @param check_crcs
	 */
	public final void setcheck_crcs(java.lang.Boolean check_crcs)
	{
		setcheck_crcs(getContext(), check_crcs);
	}

	/**
	 * Set value of check_crcs
	 * @param context
	 * @param check_crcs
	 */
	public final void setcheck_crcs(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean check_crcs)
	{
		getMendixObject().setValue(context, MemberNames.check_crcs.toString(), check_crcs);
	}

	/**
	 * @return value of fetch_max_wait_ms
	 */
	public final java.lang.Integer getfetch_max_wait_ms()
	{
		return getfetch_max_wait_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of fetch_max_wait_ms
	 */
	public final java.lang.Integer getfetch_max_wait_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.fetch_max_wait_ms.toString());
	}

	/**
	 * Set value of fetch_max_wait_ms
	 * @param fetch_max_wait_ms
	 */
	public final void setfetch_max_wait_ms(java.lang.Integer fetch_max_wait_ms)
	{
		setfetch_max_wait_ms(getContext(), fetch_max_wait_ms);
	}

	/**
	 * Set value of fetch_max_wait_ms
	 * @param context
	 * @param fetch_max_wait_ms
	 */
	public final void setfetch_max_wait_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer fetch_max_wait_ms)
	{
		getMendixObject().setValue(context, MemberNames.fetch_max_wait_ms.toString(), fetch_max_wait_ms);
	}

	/**
	 * @return value of Consumer_ConsumerConfig
	 */
	public final kafka.proxies.Consumer getConsumer_ConsumerConfig() throws com.mendix.core.CoreException
	{
		return getConsumer_ConsumerConfig(getContext());
	}

	/**
	 * @param context
	 * @return value of Consumer_ConsumerConfig
	 */
	public final kafka.proxies.Consumer getConsumer_ConsumerConfig(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		kafka.proxies.Consumer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Consumer_ConsumerConfig.toString());
		if (identifier != null)
			result = kafka.proxies.Consumer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Consumer_ConsumerConfig
	 * @param consumer_consumerconfig
	 */
	public final void setConsumer_ConsumerConfig(kafka.proxies.Consumer consumer_consumerconfig)
	{
		setConsumer_ConsumerConfig(getContext(), consumer_consumerconfig);
	}

	/**
	 * Set value of Consumer_ConsumerConfig
	 * @param context
	 * @param consumer_consumerconfig
	 */
	public final void setConsumer_ConsumerConfig(com.mendix.systemwideinterfaces.core.IContext context, kafka.proxies.Consumer consumer_consumerconfig)
	{
		if (consumer_consumerconfig == null)
			getMendixObject().setValue(context, MemberNames.Consumer_ConsumerConfig.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Consumer_ConsumerConfig.toString(), consumer_consumerconfig.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return consumerConfigMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final kafka.proxies.ConsumerConfig that = (kafka.proxies.ConsumerConfig) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Kafka.ConsumerConfig";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}