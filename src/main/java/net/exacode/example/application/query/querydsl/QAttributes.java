package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAttributes is a Querydsl query type for QAttributes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAttributes extends com.mysema.query.sql.RelationalPathBase<QAttributes> {

    private static final long serialVersionUID = -1528151397;

    public static final QAttributes attributes = new QAttributes("attributes");

    public final SimplePath<Object> attributeDefault = createSimple("attribute_default", Object.class);

    public final SimplePath<Object> attributeName = createSimple("attribute_name", Object.class);

    public final SimplePath<Object> attributeUdtCatalog = createSimple("attribute_udt_catalog", Object.class);

    public final SimplePath<Object> attributeUdtName = createSimple("attribute_udt_name", Object.class);

    public final SimplePath<Object> attributeUdtSchema = createSimple("attribute_udt_schema", Object.class);

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

    public final SimplePath<Object> isDerivedReferenceAttribute = createSimple("is_derived_reference_attribute", Object.class);

    public final SimplePath<Object> isNullable = createSimple("is_nullable", Object.class);

    public final SimplePath<Object> maximumCardinality = createSimple("maximum_cardinality", Object.class);

    public final SimplePath<Object> numericPrecision = createSimple("numeric_precision", Object.class);

    public final SimplePath<Object> numericPrecisionRadix = createSimple("numeric_precision_radix", Object.class);

    public final SimplePath<Object> numericScale = createSimple("numeric_scale", Object.class);

    public final SimplePath<Object> ordinalPosition = createSimple("ordinal_position", Object.class);

    public final SimplePath<Object> scopeCatalog = createSimple("scope_catalog", Object.class);

    public final SimplePath<Object> scopeName = createSimple("scope_name", Object.class);

    public final SimplePath<Object> scopeSchema = createSimple("scope_schema", Object.class);

    public final SimplePath<Object> udtCatalog = createSimple("udt_catalog", Object.class);

    public final SimplePath<Object> udtName = createSimple("udt_name", Object.class);

    public final SimplePath<Object> udtSchema = createSimple("udt_schema", Object.class);

    public QAttributes(String variable) {
        super(QAttributes.class, forVariable(variable), "information_schema", "attributes");
    }

    @SuppressWarnings("all")
    public QAttributes(Path<? extends QAttributes> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "attributes");
    }

    public QAttributes(PathMetadata<?> metadata) {
        super(QAttributes.class, metadata, "information_schema", "attributes");
    }

}

