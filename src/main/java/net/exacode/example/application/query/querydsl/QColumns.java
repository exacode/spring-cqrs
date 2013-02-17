package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QColumns is a Querydsl query type for QColumns
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QColumns extends com.mysema.query.sql.RelationalPathBase<QColumns> {

    private static final long serialVersionUID = 1622353177;

    public static final QColumns columns = new QColumns("columns");

    public final SimplePath<Object> characterMaximumLength = createSimple("character_maximum_length", Object.class);

    public final SimplePath<Object> characterOctetLength = createSimple("character_octet_length", Object.class);

    public final SimplePath<Object> characterSetCatalog = createSimple("character_set_catalog", Object.class);

    public final SimplePath<Object> characterSetName = createSimple("character_set_name", Object.class);

    public final SimplePath<Object> characterSetSchema = createSimple("character_set_schema", Object.class);

    public final SimplePath<Object> collationCatalog = createSimple("collation_catalog", Object.class);

    public final SimplePath<Object> collationName = createSimple("collation_name", Object.class);

    public final SimplePath<Object> collationSchema = createSimple("collation_schema", Object.class);

    public final SimplePath<Object> columnDefault = createSimple("column_default", Object.class);

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> dataType = createSimple("data_type", Object.class);

    public final SimplePath<Object> datetimePrecision = createSimple("datetime_precision", Object.class);

    public final SimplePath<Object> domainCatalog = createSimple("domain_catalog", Object.class);

    public final SimplePath<Object> domainName = createSimple("domain_name", Object.class);

    public final SimplePath<Object> domainSchema = createSimple("domain_schema", Object.class);

    public final SimplePath<Object> dtdIdentifier = createSimple("dtd_identifier", Object.class);

    public final SimplePath<Object> generationExpression = createSimple("generation_expression", Object.class);

    public final SimplePath<Object> identityCycle = createSimple("identity_cycle", Object.class);

    public final SimplePath<Object> identityGeneration = createSimple("identity_generation", Object.class);

    public final SimplePath<Object> identityIncrement = createSimple("identity_increment", Object.class);

    public final SimplePath<Object> identityMaximum = createSimple("identity_maximum", Object.class);

    public final SimplePath<Object> identityMinimum = createSimple("identity_minimum", Object.class);

    public final SimplePath<Object> identityStart = createSimple("identity_start", Object.class);

    public final SimplePath<Object> intervalPrecision = createSimple("interval_precision", Object.class);

    public final SimplePath<Object> intervalType = createSimple("interval_type", Object.class);

    public final SimplePath<Object> isGenerated = createSimple("is_generated", Object.class);

    public final SimplePath<Object> isIdentity = createSimple("is_identity", Object.class);

    public final SimplePath<Object> isNullable = createSimple("is_nullable", Object.class);

    public final SimplePath<Object> isSelfReferencing = createSimple("is_self_referencing", Object.class);

    public final SimplePath<Object> isUpdatable = createSimple("is_updatable", Object.class);

    public final SimplePath<Object> maximumCardinality = createSimple("maximum_cardinality", Object.class);

    public final SimplePath<Object> numericPrecision = createSimple("numeric_precision", Object.class);

    public final SimplePath<Object> numericPrecisionRadix = createSimple("numeric_precision_radix", Object.class);

    public final SimplePath<Object> numericScale = createSimple("numeric_scale", Object.class);

    public final SimplePath<Object> ordinalPosition = createSimple("ordinal_position", Object.class);

    public final SimplePath<Object> scopeCatalog = createSimple("scope_catalog", Object.class);

    public final SimplePath<Object> scopeName = createSimple("scope_name", Object.class);

    public final SimplePath<Object> scopeSchema = createSimple("scope_schema", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> udtCatalog = createSimple("udt_catalog", Object.class);

    public final SimplePath<Object> udtName = createSimple("udt_name", Object.class);

    public final SimplePath<Object> udtSchema = createSimple("udt_schema", Object.class);

    public QColumns(String variable) {
        super(QColumns.class, forVariable(variable), "information_schema", "columns");
    }

    @SuppressWarnings("all")
    public QColumns(Path<? extends QColumns> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "columns");
    }

    public QColumns(PathMetadata<?> metadata) {
        super(QColumns.class, metadata, "information_schema", "columns");
    }

}

