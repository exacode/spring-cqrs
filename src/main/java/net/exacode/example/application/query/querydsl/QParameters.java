package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QParameters is a Querydsl query type for QParameters
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QParameters extends com.mysema.query.sql.RelationalPathBase<QParameters> {

    private static final long serialVersionUID = -1475060946;

    public static final QParameters parameters = new QParameters("parameters");

    public final SimplePath<Object> asLocator = createSimple("as_locator", Object.class);

    public final SimplePath<Object> characterMaximumLength = createSimple("character_maximum_length", Object.class);

    public final SimplePath<Object> characterOctetLength = createSimple("character_octet_length", Object.class);

    public final SimplePath<Object> characterSetCatalog = createSimple("character_set_catalog", Object.class);

    public final SimplePath<Object> characterSetName = createSimple("character_set_name", Object.class);

    public final SimplePath<Object> characterSetSchema = createSimple("character_set_schema", Object.class);

    public final SimplePath<Object> collationCatalog = createSimple("collation_catalog", Object.class);

    public final SimplePath<Object> collationName = createSimple("collation_name", Object.class);

    public final SimplePath<Object> collationSchema = createSimple("collation_schema", Object.class);

    public final SimplePath<Object> dataType = createSimple("data_type", Object.class);

    public final SimplePath<Object> datetimePrecision = createSimple("datetime_precision", Object.class);

    public final SimplePath<Object> dtdIdentifier = createSimple("dtd_identifier", Object.class);

    public final SimplePath<Object> intervalPrecision = createSimple("interval_precision", Object.class);

    public final SimplePath<Object> intervalType = createSimple("interval_type", Object.class);

    public final SimplePath<Object> isResult = createSimple("is_result", Object.class);

    public final SimplePath<Object> maximumCardinality = createSimple("maximum_cardinality", Object.class);

    public final SimplePath<Object> numericPrecision = createSimple("numeric_precision", Object.class);

    public final SimplePath<Object> numericPrecisionRadix = createSimple("numeric_precision_radix", Object.class);

    public final SimplePath<Object> numericScale = createSimple("numeric_scale", Object.class);

    public final SimplePath<Object> ordinalPosition = createSimple("ordinal_position", Object.class);

    public final SimplePath<Object> parameterMode = createSimple("parameter_mode", Object.class);

    public final SimplePath<Object> parameterName = createSimple("parameter_name", Object.class);

    public final SimplePath<Object> scopeCatalog = createSimple("scope_catalog", Object.class);

    public final SimplePath<Object> scopeName = createSimple("scope_name", Object.class);

    public final SimplePath<Object> scopeSchema = createSimple("scope_schema", Object.class);

    public final SimplePath<Object> specificCatalog = createSimple("specific_catalog", Object.class);

    public final SimplePath<Object> specificName = createSimple("specific_name", Object.class);

    public final SimplePath<Object> specificSchema = createSimple("specific_schema", Object.class);

    public final SimplePath<Object> udtCatalog = createSimple("udt_catalog", Object.class);

    public final SimplePath<Object> udtName = createSimple("udt_name", Object.class);

    public final SimplePath<Object> udtSchema = createSimple("udt_schema", Object.class);

    public QParameters(String variable) {
        super(QParameters.class, forVariable(variable), "information_schema", "parameters");
    }

    @SuppressWarnings("all")
    public QParameters(Path<? extends QParameters> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "parameters");
    }

    public QParameters(PathMetadata<?> metadata) {
        super(QParameters.class, metadata, "information_schema", "parameters");
    }

}

