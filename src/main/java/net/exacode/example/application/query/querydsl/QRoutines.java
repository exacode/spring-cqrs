package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoutines is a Querydsl query type for QRoutines
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoutines extends com.mysema.query.sql.RelationalPathBase<QRoutines> {

    private static final long serialVersionUID = -617688461;

    public static final QRoutines routines = new QRoutines("routines");

    public final SimplePath<Object> asLocator = createSimple("as_locator", Object.class);

    public final SimplePath<Object> characterMaximumLength = createSimple("character_maximum_length", Object.class);

    public final SimplePath<Object> characterOctetLength = createSimple("character_octet_length", Object.class);

    public final SimplePath<Object> characterSetCatalog = createSimple("character_set_catalog", Object.class);

    public final SimplePath<Object> characterSetName = createSimple("character_set_name", Object.class);

    public final SimplePath<Object> characterSetSchema = createSimple("character_set_schema", Object.class);

    public final SimplePath<Object> collationCatalog = createSimple("collation_catalog", Object.class);

    public final SimplePath<Object> collationName = createSimple("collation_name", Object.class);

    public final SimplePath<Object> collationSchema = createSimple("collation_schema", Object.class);

    public final SimplePath<Object> created = createSimple("created", Object.class);

    public final SimplePath<Object> dataType = createSimple("data_type", Object.class);

    public final SimplePath<Object> datetimePrecision = createSimple("datetime_precision", Object.class);

    public final SimplePath<Object> dtdIdentifier = createSimple("dtd_identifier", Object.class);

    public final SimplePath<Object> externalLanguage = createSimple("external_language", Object.class);

    public final SimplePath<Object> externalName = createSimple("external_name", Object.class);

    public final SimplePath<Object> intervalPrecision = createSimple("interval_precision", Object.class);

    public final SimplePath<Object> intervalType = createSimple("interval_type", Object.class);

    public final SimplePath<Object> isDeterministic = createSimple("is_deterministic", Object.class);

    public final SimplePath<Object> isImplicitlyInvocable = createSimple("is_implicitly_invocable", Object.class);

    public final SimplePath<Object> isNullCall = createSimple("is_null_call", Object.class);

    public final SimplePath<Object> isUdtDependent = createSimple("is_udt_dependent", Object.class);

    public final SimplePath<Object> isUserDefinedCast = createSimple("is_user_defined_cast", Object.class);

    public final SimplePath<Object> lastAltered = createSimple("last_altered", Object.class);

    public final SimplePath<Object> maxDynamicResultSets = createSimple("max_dynamic_result_sets", Object.class);

    public final SimplePath<Object> maximumCardinality = createSimple("maximum_cardinality", Object.class);

    public final SimplePath<Object> moduleCatalog = createSimple("module_catalog", Object.class);

    public final SimplePath<Object> moduleName = createSimple("module_name", Object.class);

    public final SimplePath<Object> moduleSchema = createSimple("module_schema", Object.class);

    public final SimplePath<Object> newSavepointLevel = createSimple("new_savepoint_level", Object.class);

    public final SimplePath<Object> numericPrecision = createSimple("numeric_precision", Object.class);

    public final SimplePath<Object> numericPrecisionRadix = createSimple("numeric_precision_radix", Object.class);

    public final SimplePath<Object> numericScale = createSimple("numeric_scale", Object.class);

    public final SimplePath<Object> parameterStyle = createSimple("parameter_style", Object.class);

    public final SimplePath<Object> resultCastAsLocator = createSimple("result_cast_as_locator", Object.class);

    public final SimplePath<Object> resultCastCharMaxLength = createSimple("result_cast_char_max_length", Object.class);

    public final SimplePath<Object> resultCastCharOctetLength = createSimple("result_cast_char_octet_length", Object.class);

    public final SimplePath<Object> resultCastCharSetCatalog = createSimple("result_cast_char_set_catalog", Object.class);

    public final SimplePath<Object> resultCastCharSetSchema = createSimple("result_cast_char_set_schema", Object.class);

    public final SimplePath<Object> resultCastCharacterSetName = createSimple("result_cast_character_set_name", Object.class);

    public final SimplePath<Object> resultCastCollationCatalog = createSimple("result_cast_collation_catalog", Object.class);

    public final SimplePath<Object> resultCastCollationName = createSimple("result_cast_collation_name", Object.class);

    public final SimplePath<Object> resultCastCollationSchema = createSimple("result_cast_collation_schema", Object.class);

    public final SimplePath<Object> resultCastDatetimePrecision = createSimple("result_cast_datetime_precision", Object.class);

    public final SimplePath<Object> resultCastDtdIdentifier = createSimple("result_cast_dtd_identifier", Object.class);

    public final SimplePath<Object> resultCastFromDataType = createSimple("result_cast_from_data_type", Object.class);

    public final SimplePath<Object> resultCastIntervalPrecision = createSimple("result_cast_interval_precision", Object.class);

    public final SimplePath<Object> resultCastIntervalType = createSimple("result_cast_interval_type", Object.class);

    public final SimplePath<Object> resultCastMaximumCardinality = createSimple("result_cast_maximum_cardinality", Object.class);

    public final SimplePath<Object> resultCastNumericPrecision = createSimple("result_cast_numeric_precision", Object.class);

    public final SimplePath<Object> resultCastNumericPrecisionRadix = createSimple("result_cast_numeric_precision_radix", Object.class);

    public final SimplePath<Object> resultCastNumericScale = createSimple("result_cast_numeric_scale", Object.class);

    public final SimplePath<Object> resultCastScopeCatalog = createSimple("result_cast_scope_catalog", Object.class);

    public final SimplePath<Object> resultCastScopeName = createSimple("result_cast_scope_name", Object.class);

    public final SimplePath<Object> resultCastScopeSchema = createSimple("result_cast_scope_schema", Object.class);

    public final SimplePath<Object> resultCastTypeUdtCatalog = createSimple("result_cast_type_udt_catalog", Object.class);

    public final SimplePath<Object> resultCastTypeUdtName = createSimple("result_cast_type_udt_name", Object.class);

    public final SimplePath<Object> resultCastTypeUdtSchema = createSimple("result_cast_type_udt_schema", Object.class);

    public final SimplePath<Object> routineBody = createSimple("routine_body", Object.class);

    public final SimplePath<Object> routineCatalog = createSimple("routine_catalog", Object.class);

    public final SimplePath<Object> routineDefinition = createSimple("routine_definition", Object.class);

    public final SimplePath<Object> routineName = createSimple("routine_name", Object.class);

    public final SimplePath<Object> routineSchema = createSimple("routine_schema", Object.class);

    public final SimplePath<Object> routineType = createSimple("routine_type", Object.class);

    public final SimplePath<Object> schemaLevelRoutine = createSimple("schema_level_routine", Object.class);

    public final SimplePath<Object> scopeCatalog = createSimple("scope_catalog", Object.class);

    public final SimplePath<Object> scopeName = createSimple("scope_name", Object.class);

    public final SimplePath<Object> scopeSchema = createSimple("scope_schema", Object.class);

    public final SimplePath<Object> securityType = createSimple("security_type", Object.class);

    public final SimplePath<Object> specificCatalog = createSimple("specific_catalog", Object.class);

    public final SimplePath<Object> specificName = createSimple("specific_name", Object.class);

    public final SimplePath<Object> specificSchema = createSimple("specific_schema", Object.class);

    public final SimplePath<Object> sqlDataAccess = createSimple("sql_data_access", Object.class);

    public final SimplePath<Object> sqlPath = createSimple("sql_path", Object.class);

    public final SimplePath<Object> toSqlSpecificCatalog = createSimple("to_sql_specific_catalog", Object.class);

    public final SimplePath<Object> toSqlSpecificName = createSimple("to_sql_specific_name", Object.class);

    public final SimplePath<Object> toSqlSpecificSchema = createSimple("to_sql_specific_schema", Object.class);

    public final SimplePath<Object> typeUdtCatalog = createSimple("type_udt_catalog", Object.class);

    public final SimplePath<Object> typeUdtName = createSimple("type_udt_name", Object.class);

    public final SimplePath<Object> typeUdtSchema = createSimple("type_udt_schema", Object.class);

    public final SimplePath<Object> udtCatalog = createSimple("udt_catalog", Object.class);

    public final SimplePath<Object> udtName = createSimple("udt_name", Object.class);

    public final SimplePath<Object> udtSchema = createSimple("udt_schema", Object.class);

    public QRoutines(String variable) {
        super(QRoutines.class, forVariable(variable), "information_schema", "routines");
    }

    @SuppressWarnings("all")
    public QRoutines(Path<? extends QRoutines> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "routines");
    }

    public QRoutines(PathMetadata<?> metadata) {
        super(QRoutines.class, metadata, "information_schema", "routines");
    }

}

